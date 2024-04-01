const box1 = document.querySelector(".box1");
const changeBtn = document.querySelector(".box1-button");
const box2 = document.querySelector(".box2");
const changeBtn2 = document.querySelector(".box2-button")
const textInput = document.querySelector(".textInput");

console.log(box1.classList);
console.log(box2.classList);
console.log(box1.style.backgroundColor);
console.log(textInput);

textInput.onkeyup = () => {
    console.log(textInput.value);
}

changeBtn.onclick = () => {
    box1.classList.toggle("box1bg-button");
}

changeBtn2.onmouseover = () => {
    box2.classList.toggle("box2bg-change")
}
changeBtn2.onmouseout = () => {
    box2.classList.toggle("box2bg-change")
}