function add(x, y) {
    return x + y;
}

let result = add(10, 20);
console.log(result);

let result2 = function(x, y) {
    return x + y;
}

console.log("result2:" + result2(2,3));

//화살표 함수
let result3 = (x, y) => {
    return x + y;
}

console.log(result3(20,30));