const createButton = document.querySelector(".create-button");
const buttons = document.querySelector(".buttons");
const name = document.querySelector("#name");
const schoolCode = document.querySelector("#school-code");
const newNameTable = document.querySelector(".new-name-table");

let names = [];
let codes = [];

let clickNum = 0;

createButton.onclick = () => {
    let countNum = ++clickNum;
    if(countNum == 1) {
        const deleteButton = document.createElement("button");
        const deleteButtonText = document.createTextNode("삭제");
        const deleteButtonName = document.createAttribute("class")

        deleteButtonName.value = "total-button";
    
        deleteButton.appendChild(deleteButtonText);
        deleteButton.setAttributeNode(deleteButtonName);
        buttons.appendChild(deleteButton);
    }

    let countTabel = ++clickTable;
    while(countTabel) {
        console.log(countTabel);
    }
    const table = document.createElement("table");
    const tabletr = document.createElement("tr");
    const tabletr2 = document.createElement("tr");
    const tableth = document.createElement("th");
    const tableth2 = document.createElement("th");
    const tablethText1 = document.createTextNode("이름");
    const tablethText2 = document.createTextNode("학번");
    const tabletd = document.createElement("td");
    const tabletd2 = document.createElement("td");



    names.push(name.value);
    codes.push(schoolCode.value);

    console.log(names);
    console.log(codes);

    let inputName = names[0];
    let inputSchoolCode = codes[0];
    const inputNameNode = document.createTextNode(inputName);
    const inputSchoolCodeNode = document.createTextNode(inputSchoolCode);

    

    tabletd.appendChild(inputNameNode);
    tabletd2.appendChild(inputSchoolCodeNode);
    tableth.appendChild(tablethText1);
    tableth2.appendChild(tablethText2);
    tabletr.appendChild(tableth);
    tabletr.appendChild(tableth2);
    tabletr2.appendChild(tabletd);
    tabletr2.appendChild(tabletd2);
    table.appendChild(tabletr);
    table.appendChild(tabletr2);
    newNameTable.appendChild(table);
}