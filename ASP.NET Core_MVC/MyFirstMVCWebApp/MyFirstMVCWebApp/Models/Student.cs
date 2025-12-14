namespace MyFirstMVCWebApp.Models
{
    public class Student
    {
        public int  rollNo { get; set; }

        public String? name { get; set; }

        public string gender { get; set; } = string.Empty;
        
        public int age { get; set; }

        public string course{ get; set; } = string.Empty;

        public float fee { get; set; }

    }
}
