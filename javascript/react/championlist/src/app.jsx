import React from 'react'
import { render } from 'react-dom'
import { List } from './list.jsx'

const Text = (props) => <p>text</p>

var App = React.createClass({
	render: function(){
		return (
				<div>
					<h1>Champion list</h1>
					<List />
					<Text />
				</div>
			);
	}
});

render(
	<App />, document.getElementById('container')
)