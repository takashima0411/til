import React from 'react'
import { render } from 'react-dom'
import { List } from './list.jsx'

var App = React.createClass({
	render: function(){
		return (
				<div>
					<h1>Champion list</h1>
					<List />
				</div>
			);
	}
});

render(
	<App />, document.getElementById('container')
)