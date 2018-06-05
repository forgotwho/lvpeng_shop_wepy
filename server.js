var express = require('express');
var bodyParser = require('body-parser');
var app = express();
var fs = require("fs");
const promisify = require('util').promisify;
const writeFile = fs.writeFile;
const mkdirp = require('mkdirp');
 
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

app.post('/add',function(req,res,next){
		const type = req.body['type'];
		const java_dir = '../java/'+type;
		// Create model direactor
		mkdirp(java_dir);
		const fileName = req.body['fileName'];		
		const beanText = req.body['beanText'];
    writeFile(java_dir+'/'+fileName,beanText);
		res.send('Ok');
});

var server = app.listen(8081, function () {
  var host = server.address().address
  var port = server.address().port
  console.log("应用实例，访问地址为 http://%s:%s", host, port)
})