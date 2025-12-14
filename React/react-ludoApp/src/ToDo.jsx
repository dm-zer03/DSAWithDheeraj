import { useState } from "react";
import { v4 as uuidv4 } from "uuid";
export default function ToDo() {
  let [todos, setTodos] = useState([
    { task: "sampleTask", id: uuidv4(), isDone: false },
  ]);
  let [newTodo, setNewToDo] = useState("");

  let newTask = () => {
    /*setTodos([...todos, {task:newTodo,id:uuidv4()}]);*/
    setTodos((prevTodos) => {
      return [...prevTodos, { task: newTodo, id: uuidv4(), isDone: false }];
    });
    setNewToDo("");
  };

  let updateTodoValue = (event) => {
    setNewToDo(event.target.value);
  };

  let deleteTodo = (id) => {
    //Deleting in the array
    setTodos((prevTodos) => todos.filter((prevTodos) => prevTodos.id != id));
    // console.log(copy);
  };

  //upperCaseAll
  let markAsDoneAll = () => {
    setTodos((prevTodos) =>
      prevTodos.map((todo) => ({
        ...todo,
        //task: todo.task.toUpperCase()
        isDone: true,
      }))
    );
  };

  // upperCaseOne
  let markAsDone = (id) => {
    setTodos((prevTodos) =>
      prevTodos.map((todo) => {
        if (todo.id === id) {
          return {
            ...todo,
            // task: todo.task.toUpperCase(),
            isDone: true,
          };
        } else {
          return todo;
        }
      })
    );
  };

  return (
    <div>
      <input
        placeholder="add a task"
        value={newTodo}
        onChange={updateTodoValue}
      ></input>
      <br></br>
      <button onClick={newTask}>Add Task </button>
      <br></br>
      <br></br>
      <br></br>
      <hr></hr>
      <h4>ToDo List</h4>
      <ul>
        {todos.map((todo) => (
          <li key={todo.id}>
            <span
              style={todo.isDone ? { textDecorationLine: "line-through" } : {}}
            >
              {todo.task}
            </span>
            &nbsp;&nbsp;
            <button onClick={() => deleteTodo(todo.id)}>Delete</button>
            &nbsp;&nbsp;
            <button onClick={() => markAsDone(todo.id)}>MarkAsDone</button>
          </li>
        ))}
      </ul>
      <br></br>
      <br></br>
      <button onClick={markAsDoneAll}>MarkAsDoneAll</button>
    </div>
  );
}
