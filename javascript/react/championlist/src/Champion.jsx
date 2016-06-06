import React from 'react'

export default class Champion extends React.Component {
    constructor(props) {
        super(props)
    }
    render() {
        var championImg = `http://ddragon.leagueoflegends.com/cdn/6.10.1/img/champion/${this.props.champion.id}.png`;
        return 	(
            <div className="champion panel panel-default col-xs-6 col-sm-4 col-md-3 col-lg-2">
                <div className="panel-body">
                    <strong>{this.props.champion.name}</strong>
                    <img src={championImg} />
                </div>
            </div>
        );
    }
}