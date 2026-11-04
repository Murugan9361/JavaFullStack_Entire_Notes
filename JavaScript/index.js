// console.log("Hello world")
// // var let const 

// var a="one";
// console.log(a)

// var a="two"
// console.log(a)

// a="three"
//  console.log(a)

//  let b=0;
//  console.log(b)
//  b=5;
//  console.log(b)

//  const c=10;
//  console.log(c)
//  c=96
//  console.log(c)


// console.log("Krishna ......!")

// let a=Number(prompt("Enter the Mark :"))

// console.log(typeof(a))
// let b=Boolean(-1)

// console.log(typeof(b))
// console.log(b)




let total_std=Number(prompt("Enter the std count :"))
 
 for(let i=total_std;i>0;i--){
 let name=prompt("Enter Your Name")
 let tamil=Number(prompt("Enter the tamil mark : "))
 let english=Number(prompt("Enter the english mark : "))
 let maths=Number(prompt("Enter the maths mark : "))
 let science=Number(prompt("Enter the science mark : "))
 let ss=Number(prompt("Enter the ss mark : "))
 let total=tamil+english+maths+science+ss
 console.log("Student name is ",name)
 console.log("Total : ",total)

 let avg=total/5

 if(tamil<35 || english<35 || maths<35 || science<35 || ss<35){
   console.log("Fail")
   console.log("No Grade")
 }
 else{

    if(avg>90 && avg<100){
        console.log("Grade A : Very Good😁")
    }
    else if(avg>80 && avg<=90){
        console.log("Grade B : Good 😎")
    }
     else if(avg>70 && avg<=80){
        console.log("Grade c : Average 😒")
    }
    else{
        console.log("No Grade .....🫪")
    }

 }
}


