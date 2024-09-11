import { useState, useEffect } from 'react'

const TodosList = () => {
    const [todos, setTodoList] = useState([]);
    
    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/todos')
            .then(response => response.json())
            .then(todos => setTodoList(todos))
    }, []);
    return (
        <div>
            {todos.map(todo => <h2 key={todo.id}> {todo.title} - {todo.completed ? 'true' : 'false'} </h2>)}
        </div>
    )
}

export default  TodosList;