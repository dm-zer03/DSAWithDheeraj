import { useState } from "react";
import CommentsForm from "./CommentsForm";
import "./Comment.css";
export default function Comment() {
  let [comments, setComments] = useState([
    {
      username: "@dm_zer03",
      remarks: "Self Made CS Engineer!",
      rating: 5,
    },
  ]);

  let addNewComment = (comment) => {
    setComments((currComments) => [...currComments, comment]);
  };

  return (
    <>
      <div>
        <h3>All Comments</h3>
        {comments.map((comment, idx) => (
          <div className="comment" key={idx}>
            <span>Remarks: {comment.remarks},</span>&nbsp;
            <span>Rating: ({comment.rating})</span>&nbsp;
            <p>- {comment.username}</p>
          </div>
        ))}
      </div>
      <hr />
      <CommentsForm addNewComment={addNewComment} />
    </>
  );
}
