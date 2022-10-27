function main(){
    console.log("Hi")
    function con(msg){
        console.log(msg)
    }
    function tmp(msg,mycall){
        console.log("hai")
        mycall(msg)
    }
    tmp("knock knock",con)
    setTimeout(function(){
        console.log("Hello")
    },5000)
    console.log("gud bye")
    setTimeout(function(){
        console.log("Guess who?")
    },5000)
}
main()
// // Synchronous
// arr = [1,2,3,4]
// arr.forEach(function(i) {
//     console.log(i)
// })

// // Asynchronous
// function tmp(array, cb) {
//     array.forEach(function() {
//         setTimeout(cb, 1000)
//     })
// }

// tmp(arr, function(i) {
//     console.log(i)
// })
