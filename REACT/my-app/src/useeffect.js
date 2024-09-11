import { useState, useEffect } from 'react'

const UserList = () => {
    const [userList, setUserList] = useState([]);
    
    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/users')
            .then(response => response.json())
            .then(users => setUserList(users))
    }, []);
    return (
        <div>
            {userList.map(user => <h2 key={user.id}> {user.name} - {user.email} - {user.website} - {user.company.name} </h2>)}
        </div>
    )
}

export default UserList;