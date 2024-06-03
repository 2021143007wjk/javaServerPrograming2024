function calcjs(){
	var n1 = parseFloat(document.getElementById('n1').value)
	var n2 = parseFloat(document.getElementById('n2').value)
	var op = document.getElementById('op').value			
	
	result = 0
	
	switch (op) {
	case '+':
		result = n1+n2
		break;
	case '-':
		result = n1-n2			
		break;
	case '*':
		result = n1*n2						
		break;
	case '/':
		result = n1/n2									
		break;

	}
	
	document.getElementById('n3').value = result
	
}