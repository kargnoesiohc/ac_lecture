<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>main.jsp</h3>
	<button id="aaa">aaa 호출: login 호출</button>
	<button id="bbb">bbb 호출: ArrayList</button>
	<button id="ccc">ccc 호출: HashMap</button>
	<button id="ddd">ddd 호출: String</button>
	<button id="eee">eee 호출</button>
	<button id="fff">fff 호출</button>
	<div id="result"></div>

	<script type="text/javascript">
	 const aaa = document.querySelector('#aaa');
     const bbb = document.querySelector('#bbb');
     const ccc = document.querySelector('#ccc');
     const ddd = document.querySelector('#ddd');
     const eee = document.querySelector('#eee');
     const fff = document.querySelector('#fff');
      const result = document.querySelector('#result');
      
    /*   eee.addEventListener('click', () => {
    	  fetch('eee')
    	  	.then(response => response.text())
    	  	.then(data => result.innerHTML = data);
      })
      
      fff.addEventListener('click', () => {
    	  function runPromise(resolve, reject){
    		  resolve('mesg');
    		}
    	  fetch('fff')
    	  	.then(() => new Promise(runPromise))
    	  	.then(response => response.text())
    	  	.then(data => result.innerHTML = data);
      }) */
      
      aaa.addEventListener('click', () => {
    	  fetch('aaa')
    	  	.then(response => response.json())
    	  	.then(json => result.innerHTML = JSON.stringify(json));
      })
      
      bbb.addEventListener('click', () => {
    	  fetch('bbb')
    	  	.then(response => response.json())
    	  	.then(data => {
    	  		for(let i=0; i< data.length; i++) {
    	  			console.log(data[i].userid, data[i].passwd);
    	  			result.innerHTML += JSON.stringify(data[i])+"<br>";
    	  		}
    	  	})
      })
      
      ccc.addEventListener('click', () => {
    	fetch('ccc')
    		.then(response => response.json())
    		.then(data => {
    			console.log(data.one);
    			console.log(data.two);
    		})
      })
      
      ddd.addEventListener('click', () => {
        fetch('ddd')
          .then(response => response.text())
          .then(data => result.innerHTML = data );
      })
      
	</script>
</body>
</html>