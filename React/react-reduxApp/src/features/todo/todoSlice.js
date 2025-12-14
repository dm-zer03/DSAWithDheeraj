import { createSlice, nanoid } from "@reduxjs/toolkit";

const initialState = {
  todo: [{ id: "abc", task: "demo-task", isDone: false }], // Fixed key-value syntax
};

export const todoSlice = createSlice({
  name: "todo",
  initialState,
  reducers: {
    addToDo: (state, action) => {
      const newTodo = {
        id: nanoid(), // Generate unique ID
        task: action.payload, // Take task from the dispatched action
        isDone: false,
      };
      state.todo.push(newTodo); // Use `.push()` to add to the array
    },


    deleteToDo: (state, action) => {
        const newTodo = {
          id: nanoid(), // Generate unique ID
          task: action.payload, // Take task from the dispatched action
          isDone: false,
        };
        state.todo.push(newTodo); // Use `.push()` to add to the array
      },
  },
});

export const { addToDo } = todoSlice.actions; // Export the action
export default todoSlice.reducer; // Export the reducer
