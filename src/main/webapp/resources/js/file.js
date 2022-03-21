const fileAdd = document.getElementById("fileAdd");
const fileResult = document.getElementById("fileResult");
const del = document.getElementsByClassName("del");

let count=0;
let num=0; //id용도

fileAdd.addEventListener("click", function(){

    //count=count+1;
    // count++;
    
    // if(count>5){
    //     alert('첨부파일은 최대 5개 만 가능');
    //     count--;
    //     return ;
    // }

    
    // if(count>4){
    //     alert('첨부파일은 최대 5개 만 가능');
    //     return ;
    // }
    
    // count++;

    
    count++;
    if(count>5){
        alert('첨부파일은 최대 5개 만 가능');
        count=5;
        return ;
    }

 
    
    let div = document.createElement('div');   //<div></div>
    div.setAttribute("id", "del"+num);
    
    let file = document.createElement("input"); //<input>
    file.setAttribute("type", "file");          //<input type="file">
    file.setAttribute("name", "files");         //<input type="file" name="files">

    let button = document.createElement('button'); //<button></button>
    button.setAttribute("type", "button");
    button.className="del";
    button.setAttribute("data-num", "del"+num);
    button.innerHTML="DEL";

    div.append(file);
    div.append(button);

    fileResult.append(div);

    num++;

});

fileResult.addEventListener("click", function(event){
    let cn = event.target;
   
    if(cn.classList.contains('del')){
        let delNum = cn.getAttribute("data-num");
        document.getElementById(delNum).remove();
        count--;
    }

});