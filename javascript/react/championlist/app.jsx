import React from 'react'
import { render } from 'react-dom'

var App = React.createClass({
	render: function(){
		return (
				<div>
					<h1>Champion list</h1>
				</div>
			);
	}
});

render(
	<App />, document.getElementById('container')
)