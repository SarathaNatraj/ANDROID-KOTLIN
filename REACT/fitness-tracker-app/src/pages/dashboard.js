const Dashboard = () => {
    return (

        <div className="App-header">
            <h2> Dashboard</h2>

            <div class="card profile">
                <h2>Good Morning Champ!</h2>
                <p>Time to seize the day</p>
            </div>
            <div class="card challenges" >
		<h2>Challenges</h2>
		<ul>
			<li>
				<span>30-day running streak</span>
				<div class="progresscircle">
					<div>10/30</div>
					<svg xmlns="http://www.w3.org/2000/svg" version="1.1" viewbox="0 0 100 100">
						<circle cx="50" cy="50" r="40" stroke-linecap="round" />
					</svg>
				</div>
			</li>
			<li>
				<span>1000 pushups in a month</span>
				<div class="progresscircle">
					<div>670</div>
					<svg xmlns="http://www.w3.org/2000/svg" version="1.1" viewbox="0 0 100 100">
						<circle cx="50" cy="50" r="40" stroke-linecap="round" />
					</svg>
				</div>
			</li>
			<li>
				<span>Swim 20km in a month</span>
				<div class="progresscircle">
					<div>9/20</div>
					<svg xmlns="http://www.w3.org/2000/svg" version="1.1" viewbox="0 0 100 100">
						<circle cx="50" cy="50" r="40" stroke-linecap="round" />
					</svg>
				</div>
			</li>
		</ul>
	</div>

            <div class="card activity-feed" >
		<h2>Friends Activity</h2>
		<ul>
			<li>Jane just set a new record in cycling: 30 miles!</li>
			<li>Mike completed the 30-Day Running Streak Challenge!</li>
			<li>Anna shared a new workout: 'Hill Sprints Interval'.</li>
		</ul>
	</div>


        </div>
    );
}

export default Dashboard;