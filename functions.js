function printhello()
{
    console.log("Hello World");
}
setInterval(printhello,2000);

let num = 1;
function displaynumbers()
{
    console.log(num);
    num++;

    if(num>10)
    {
        clearInterval(interval);
    }
}
let interval = setInterval(displaynumbers,1000);

function showtime()
{
    let currenttime = new Date();
    console.log(currenttime.toLocaleDateString());
}
setInterval(showtime,1000);

let even =2;
function displayeven()
{
    console.log(even);
    even +=2;
}
setInterval(displayeven,2000);


let count =10;
function countdown()
{
    console.log(count);
    count--;

    if(count<0)
    {
        clearInterval(timer);
        console.log("coundown finished");
    }
}
let timer = setInterval(countdown,1000);

const addnumbers =(a,b) => {
    return a+b;
};

function displayresult(sum)
{
    console.log("sum is :",sum);
}

let num1=10;
let num2=20;
let result= addnumbers(num1,num2);
displayresult(result);

let num=7;
let checknumber = function(number){
    if(number%2==0)
    {
        console.log(number + "is even");
    }else{
        console.log(number + "is odd");
    }

};
checknumber(num);

const multiplyNumbers = (a, b) => {
    return a * b;
};

let num1 = 20;
let num2 = 6;

let result1 = multiplyNumbers(num1, num2);


let checkResult = function(product) {

    if (product > 100) {
        console.log(product + " is greater than 100");
    } else {
        console.log(product + " is not greater than 100");
    }

};

checkResult(result1);