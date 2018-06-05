var express = require('express');
var bodyParser = require('body-parser');
var app = express();
var path = require('path');
var fs = require("fs");
 
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));

app.post('/add',function(req,res,next){
		const type = req.body['type'];
		const fileName = req.body['fileName'];		
		const beanText = req.body['beanText'];
    fs.writeFile('java/'+type+'/'+fileName,beanText);
		res.send('Ok');
});

var server = app.listen(8081, function () {
  var host = server.address().address
  var port = server.address().port
  console.log("应用实例，访问地址为 http://%s:%s", host, port)
})