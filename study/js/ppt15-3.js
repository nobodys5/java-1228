const box1 = document.querySelector(".box1");
const changeBtn = document.querySelector(".change-btn");


console.log(box1.classList);

changeBtn.onclick = () => {
    box1.classList.toggle("bg-color");
}

