console.log("Hello, World!");
console.error("Hello, World!");
let details={
    "name":'murugan',
    "age":24,
    "city":"Theni"
}

console.table(details)

console.time("timer")

for(let a=0;a<=10;a++){
    console.log(a)
}
console.timeEnd('timer')
console.warn("caution")


// Primitive Data types


let age = 25;
let price = 99.50;

console.log(age);
console.log(price);
console.log(typeof age);
console.log(typeof price);

let name = "6585656";
let city = 'Theni';

console.log(name);
console.log(city);
console.log(typeof name);

let isStudent = true;
let isWorking = false;

console.log(isStudent);
console.log(isWorking);
console.log(typeof isStudent);

let salary;

console.log(salary);
console.log(typeof salary);

let selectedProduct = null;

console.log(selectedProduct);
console.log(typeof selectedProduct);

let id1 = Symbol("id");
let id2 = Symbol("id");

console.log(id1 === id2);
console.log(typeof id1);

let num = 12345678901234567890n;

console.log(num);
console.log(typeof num);


// 2. Non-Primitive Data Types
// Non-primitive data types can represent collections of values or more complex data.

let student = {
    name: "Sakthi",
    age: 25,
    course: ".NET"
};

console.log(student);
console.log(student.name);
console.log(student.age);
console.log(typeof student);

let fruits = ["Apple", "Mango", "Orange"];

console.log(fruits);
console.log(fruits[0]);
console.log(fruits[1]);
console.log(typeof fruits);
console.log(Array.isArray(fruits));

function add(a, b) {
    return a + b;
}

console.log(add(10, 20));
console.log(typeof add);