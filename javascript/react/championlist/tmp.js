'use strict';

var _react = require('react');

var _react2 = _interopRequireDefault(_react);

var _reactDom = require('react-dom');

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var App = _react2.default.createClass({
	displayName: 'App',

	render: function render() {
		return _react2.default.createElement(
			'div',
			null,
			_react2.default.createElement(
				'h1',
				null,
				'Champion list'
			)
		);
	}
});

(0, _reactDom.render)(_react2.default.createElement(App, null), document.getElementById('container'));
