const nameInput = document.querySelector(".name-input");
const colorInput = document.querySelector(".color-input");
const createButton = document.querySelector(".create-button");
const newNametag = document.querySelector(".new-nametag");
const container = document.querySelector("#container");


createButton.onclick = () => {
    newNametag.textContent = nameInput.value;

    if(colorInput.value == "black") {
        newNametag.style.color = "white";
    };
    newNametag.style.backgroundColor = colorInput.value;

};

container.onkeypress = () => {
    if(window.event.keyCode == 13) {
        createButton.onclick();
    }
}