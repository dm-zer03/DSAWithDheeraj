using AutoMapper;
using Mango.Services.CouponAPI.Data;
using Mango.Services.CouponAPI.Models;
using Mango.Services.CouponAPI.Models.Dto;
using Mango.Web.Models.Dto;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace Mango.Services.CouponAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CouponAPIController : ControllerBase
    {
        private ResponseDto _response;
        private readonly AppDbContext _dbContext;
        private IMapper _mapper;

        public CouponAPIController(AppDbContext dbContext, IMapper mapper)
        {
            _mapper = mapper;
            _dbContext = dbContext;
            _response = new ResponseDto();
        }

        /* [HttpGet]
         public async Task<ActionResult<IEnumerable<Coupon>>> Get()
         {
             try
             {
                 var objList = await _dbContext.Coupons.ToListAsync();
                 return Ok(objList);
             }
             catch (Exception ex)
             {
                 return StatusCode(500, "Internal server error: " + ex.Message);
             }
         }


         [HttpGet("{id}")]
         //Route("{id:int}")
         public async Task<ActionResult<Coupon>> Get(int id)
         {
             try
             {
                 var coupon = await _dbContext.Coupons.FirstOrDefaultAsync(u => u.CouponId == id);

                 if (coupon == null)
                     return NotFound();

                 return Ok(coupon);
             }
             catch (Exception ex)
             {
                 return StatusCode(500, "Internal server error: " + ex.Message);
             }
         }*/

        [HttpGet]
        public async Task<ActionResult<ResponseDto>> Get()
        {
            try
            {
                var objList = await _dbContext.Coupons.ToListAsync();
                //_response.Result= objList;
                _response.Result = _mapper.Map<IEnumerable<CouponDto>>(objList);

            }
            catch (Exception ex)
            {
                _response.IsSuccess = false;
                _response.Message = ex.Message;
            }
            return _response;
        }
        [HttpGet("{id}")]
        //Route("{id:int}")
        public async Task<ActionResult<ResponseDto>> Get(int id)
        {
            try
            {
                var coupon = await _dbContext.Coupons.FirstOrDefaultAsync(u => u.CouponId == id);
                //_response.Result= coupon;
                _response.Result = _mapper.Map<CouponDto>(coupon);
                if (coupon == null)
                    return NotFound();
            }
            catch (Exception ex)
            {
                _response.IsSuccess = false;
                _response.Message = ex.Message;
            }
            return _response;
        }


        [HttpGet]
        [Route("GetByCode/{code}")]
        public async Task<ActionResult<ResponseDto>> GetByCode(string code)
        {
            try
            {
                var coupon = await _dbContext.Coupons.FirstOrDefaultAsync(u => u.CouponCode.ToLower() == code.ToLower());
                //_response.Result= coupon;
                _response.Result = _mapper.Map<CouponDto>(coupon);
                if (coupon == null)
                    return NotFound();
            }
            catch (Exception ex)
            {
                _response.IsSuccess = false;
                _response.Message = ex.Message;
            }
            return _response;
        }

        [HttpPost]
        public ResponseDto Post([FromBody] CouponDto couponDto)
        {
            try
            {
                Coupon obj = _mapper.Map<Coupon>(couponDto);
                _dbContext.Coupons.Add(obj);
                _dbContext.SaveChanges();

                _response.Result = _mapper.Map<CouponDto>(obj);

            }
            catch (Exception ex)
            {

                _response.IsSuccess = false;
                _response.Message = ex.Message;
            }
            return _response;
        }


        [HttpPut]
        public ResponseDto Update([FromBody] CouponDto couponDto)
        {
            try
            {
                Coupon obj = _mapper.Map<Coupon>(couponDto);
                _dbContext.Coupons.Update(obj);
                _dbContext.SaveChanges();

                _response.Result = _mapper.Map<CouponDto>(obj);

            }
            catch (Exception ex)
            {

                _response.IsSuccess = false;
                _response.Message = ex.Message;
            }
            return _response;
        }

        [HttpDelete]
        public ResponseDto Delete(int id)
        {
            try
            {
                Coupon obj = _dbContext.Coupons.FirstOrDefault(u => u.CouponId == id); ;
                _dbContext.Coupons.Remove(obj);
                _dbContext.SaveChanges();

            }
            catch (Exception ex)
            {

                _response.IsSuccess = false;
                _response.Message = ex.Message;
            }
            return _response;
        }

    }
}
