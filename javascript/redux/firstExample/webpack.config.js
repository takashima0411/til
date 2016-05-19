var webpack = require('webpack');

module.exports = {
  context: __dirname,
  entry: {
    javascript: './src/app.jsx',
    html: './src/index.html'
  },
  output: {
    path: './dist',
    filename: 'app.js'
  },
  resolve: {
    extensions: ['', '.js', '.jsx']
  },  
  // devtool: "source-map",
  plugins: [],
  module: {
    loaders: [
      {
        test: /\.jsx$/,
        exclude: /node_modules/,
        loader: 'babel-loader',
        query: {
          cacheDirectory: true,
          presets: ['es2015', 'react']
        }
      },
      {
        test: /\.js$/,
        exclude: /node_modules/,
        loader: 'babel-loader',
        query: {
          cacheDirectory: true,
          presets: ['es2015']
        }
      },      
      {
        test: /\.html$/,
        loader: 'file?name=[name].[ext]'
      }
    ]
  }
};
