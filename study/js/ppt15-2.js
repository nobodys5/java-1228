let add2 = function(x, y) {
    return x + y;
}

main();

function add(x, y) {
    return x+ y;
}



function main() {
    let num1 = 10;
    let num2 = 20;

    let result = add(num1, num2);
    console.log("결과:" + result);

    let result2 = add2(num1, num2);
    console.log("결과2:" + result2);

    let result3 = function(x, y) {return x + y}(num1, num2);
    console.log("결과3:" + result3);
}