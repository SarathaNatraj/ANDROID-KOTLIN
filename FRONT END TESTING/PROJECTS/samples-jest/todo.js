
class TodoList{
 
    constructor(){
        this.tasks=[];
    }
    //adding new task
    addTask(task){
        if(task){
            this.tasks.push(task);
            return true;
        }
 
        return false;
    }
 
    //removing the task
    removeTask(task){
        const taskIndex = this.tasks.indexOf(task);
        if(taskIndex > -1){
            this.tasks.splice(taskIndex,1);
            return true;
        }
        return false;
    }
 
    getTasks(){
        return this.tasks;
    }
}
 
module.exports=TodoList;