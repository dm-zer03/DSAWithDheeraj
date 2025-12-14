import { useState } from "react";
import { useFormik } from "formik";

const validate = (values) => {
    const errors = {};
    if (!values.username) {
      errors.username = "Username is required";
    }
    return errors;
  };

export default function CommentsForm({ addNewComment }) {
  //   const [formData, setFormData] = useState({
  //     username: "",
  //     remarks: "",
  //     rating: 5,
  //   });
  const formik = useFormik({
    initialValues: {
      username: "",
      remarks: "",
      rating: 5,
    },validate,
    onSubmit:values=>{
        alert(JSON.stringify(values,null,2));
    }
  });

  /*
  const handleInputChange = (event) => {
    setFormData((currData) => {
      return { ...currData, [event.target.name]: event.target.value };
    });
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    addNewComment(formData);
    console.log(formData);
    // Reset form after submission
    setFormData({
      username: "",
      remarks: "",
      rating: 5,
    });
  };
*/
  return (
    <div>
      <h4>Give a Comment!</h4>
      <form onSubmit={formik.handleSubmit}>
        <label htmlFor="username">Username</label>
        <input
          placeholder="Username"
          type="text"
         // value={formData.username}
         value={formik.values.username}
          name="username"
          id="username"
          onChange={formik.handleChange}
        />
         {formik.errors.username && formik.touched.username && (
            <div style={{ color: "red" }}>{formik.errors.username}</div>

      )}
        <br />
        <br />
        <label htmlFor="remarks">Remarks</label>
        <textarea
          placeholder="Remarks"
          value={formik.values.remarks}
          name="remarks"
          id="remarks"
          onChange={formik.handleChange}
        />
        <br />
        <br />
        <label htmlFor="rating">Rating</label>
        <input
          placeholder="Rating"
          type="number"
          min={1}
          max={5}
          value={formik.values.rating}
          name="rating"
          id="rating"
          onChange={formik.handleChange}
        />
        <br />
        <br />
        <button type="submit">Add Comment</button>
      </form>
    </div>
  );
}
