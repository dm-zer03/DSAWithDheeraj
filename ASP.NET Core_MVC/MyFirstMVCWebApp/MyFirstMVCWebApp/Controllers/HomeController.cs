using System.Diagnostics;
using System.Net.Http.Headers;
using Microsoft.AspNetCore.Mvc;
using MyFirstMVCWebApp.Models;

namespace MyFirstMVCWebApp.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            Student student = new Student()
            {
                rollNo = 1,
                name = "Test",
                gender = "male",
                age = 18,
                course = "Java",
                fee = 7000,
            };

            //student model is sent to Index View.
            return View(student);
        }
        public IActionResult Default()
        {
            var prod = new StrongType();
            prod.prodId = 1;
            prod.prodName = "Lenovo";
            prod.prodPrice = 10000;
            prod.prodQty = 10;

            return View(prod);
        }

        public IActionResult ShowStudents()
        {

            List<Student> students = new List<Student>()
{
              new Student()
              {
                 rollNo = 1,
                 name = "Test",
                 gender = "Male",
                 age = 18,
                 course = "Java",
                 fee = 7000
              },

              new Student()
              {
                 rollNo = 2,
                 name = "Alice",
                 gender = "Female",
                 age = 20,
                 course = "Python",
                 fee = 8000
              },

              new Student()
              {
                rollNo = 3,
                name = "Bob",
                gender = "Male",
                age = 22,
                course = "C#",
                 fee = 7500
              }
            };

            return View(students);
        }

        public IActionResult Index1()
        {
            var prod = new StrongType();
            prod.prodId = 1;
            prod.prodName = "Lenovo";
            prod.prodPrice = 10000;
            prod.prodQty = 10;

            return View(prod);
        }


        /*public String AboutUs()
         {
             return "This Is About us Page";
         }*/

        public IActionResult Default1()
        {
            //If We Want To Call another view inside method
            return View("Index");
        }


        public IActionResult AboutUs()
        {
            return View();
        }

        public IActionResult ViewDataType()
        {
            ViewData["prod"] = 1;
            ViewData["prodName"] = "AcerAspire5";
            ViewData["prodPrice"] = 4000;
            ViewData["prodQty"] = 10;
            //Need Not to Pass ViewData Explicitly
            return View();
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
