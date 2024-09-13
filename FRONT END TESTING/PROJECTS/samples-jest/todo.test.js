//import todolist
 
const TodoList = require("./todo");
 
 
 
describe("TodoList", () => {
  let todoList;
 
  //before each and every test method is called
  beforeEach(() => {
    console.log("before Each - todo.test.js");
    todoList = new TodoList();
  });
 
  //test case for addTask method
  test("should add task  successfully", () => {

    //AAA

    //Assign
    const task = "Learn html";

    //Action
    const result = todoList.addTask(task);
 
    //Assertion - comparing the results
    expect(result).toBe(true);
    expect(todoList.getTasks()).toContain(task);
  });

  //test case for removeTask method
    it('should remove task successfully', ()=>{
    //AAA - Assign, Action, Assert

    //Assignment
    const task = "Learn html";
    todoList.addTask(task);

    //Action 
    const result = todoList.removeTask(task);

    //Assertion
    expect(result).toBe(true);
    expect(todoList.getTasks()).not.toContain(task);

  })

  //test case for getTasks method
  it('should return the correct list of tasks', ()=>{
    //Assign 
    const task1= 'Learn HTML';
    const task2= 'Learn CSS';
    todoList.addTask(task1);
    todoList.addTask(task2);

    //Action + Assertion
    expect(todoList.getTasks()).toEqual([task1,task2]);

    expect(todoList.getTasks()).toHaveLength(2);

  })

});
 