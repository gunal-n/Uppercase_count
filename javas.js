event.preventDefault(); //prevent default form submission

let isValid = true;

//clear previous error messages
document.getElementById('usernameError').textContent = '';
document.getElementById('emailError').textContent = '';
document.getElementById('passwordError').textContent = '';

//validate Username
const username = document.getElementById('username').value;
if(username.trim() === ''){
    document.getElementById('usernameError').textContent = 'Username is required';
    isValid = false;
}
else if(username.length < 3){
     document.getElementById('usernameError').textContent = 'Username must be at least 3 long';
     isValid = false;
}

//validate email
const email = document.getElementById('email').value;
if(username.trim() === ''){
    document.getElementById('emailError').textContent = 'Email is required';
    isValid = false;
}
else if(!emailRegex.test(email)){
     document.getElementById('emailError').textContent = 'Please enter the valid email';
     isValid = false;
}

//validate password
const password = document.getElementById('password').value;
if(username.trim() === ''){
    document.getElementById('passwordError').textContent = 'Password is required';
    isValid = false;
}
else if(password.length < 6){
     document.getElementById('passwordError').textContent = 'Password must be at least 6 long';
     isValid = false;
}

if(isValid){
    alert('Form submitted successfully!');
    //hear you would typically send the form data to a server
    //e.g using fetch()
    document.
}