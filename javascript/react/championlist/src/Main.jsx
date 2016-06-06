import React from 'react'
import $ from 'jquery'
import Champion from './Champion.jsx'

export default class Main extends React.Component {
    constructor(props) {
        super(props);
        this.state = "";
    }

    componentDidMount() {
        var _this = this;
        $.get('https://ddragon.leagueoflegends.com/cdn/6.10.1/data/jp_JP/champion.json', function (result) {
            _this.setState({champions: result.data});
        });
    }

    render() {
        var data = $.map(this.state.champions, function (champion, hoge) {
            return (<Champion champion={champion}/>);
        });
        return (
            <div className="MainComponent container-fluid">
                <h1>Champions</h1>
                <div id="data">
                    {data}
                </div>
            </div>
        );
    }
}