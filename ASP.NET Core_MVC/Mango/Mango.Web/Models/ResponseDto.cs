using System.Security.AccessControl;
namespace Mango.Web.Models
{
    public class ResponseDto
    {
        public string ApiType { get; set; } = "GET";
        public string Url { get; set; }
        public object Data { get; set; }
        public string AccessToken { get; set; }
    }
}
