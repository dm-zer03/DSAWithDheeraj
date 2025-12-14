using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using WebAPI_1.Models;

namespace WebAPI_1.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class StudentController : ControllerBase
    {

        public readonly WebApidbContext context;

        public StudentController(WebApidbContext context)
        {
            this.context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<Student>>> Get() {

            var students = await context.Students.ToListAsync();
            return students;
        
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Student>> Get(int id)
        {

            var student = await context.Students.FirstOrDefaultAsync(x=>x.Id==id);
            if (student != null)
            {
                return student;
            }
            return NotFound();
        }

        [HttpPost]
        public async Task<ActionResult> Create (Student stu)
        {

            if (stu != null) {

                context.Students.Add(stu);
                await context.SaveChangesAsync();
                return Ok();
            }return NotFound();
        }

        [HttpPut("{id}")]
        public async Task<ActionResult> Update(int id,Student stu)
        {

            if (id==stu.Id)
            {

                context.Entry(stu).State = EntityState.Modified;
                //OR context.Students.Update(stu);
                await context.SaveChangesAsync();
                return Ok();
            }
            return NotFound();
        }

        [HttpDelete("{id}")]
        public async Task<ActionResult> Delete(int id)
        {
            var stu = await context.Students.FindAsync(id);

            if (stu == null)
            {
                return NotFound();
            }

            context.Students.Remove(stu);
            await context.SaveChangesAsync();

            return Ok($"Student with ID {id} deleted successfully.");
        }

    }
}
