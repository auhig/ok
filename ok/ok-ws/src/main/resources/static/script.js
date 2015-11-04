function sayHello(name) {
	return 'hello ' + name
}

(function() {
	function innerMethod() {
		return 'inner';
	}
})();