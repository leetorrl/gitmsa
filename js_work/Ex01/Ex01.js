var H = document.querySelector("#heading");

var B = document.querySelector("#btn");

    H.onclick = function doA(){
      if(H.style.color === 'blue'){
        H.style.color = ""
      alert('돌아옴!');
      
      H.innerHTML = "자바스크립트";

    
      }else{

        alert('파란색!');
        H.style.color = "blue";
        H.innerHTML = "파랗다!";

      }

    };

    B.onclick = function(){

const I = document.querySelector('#in')

      var name = prompt('당신의 이름은?','');
      if(name===null){
        alert("입력하세요1");
        return;
      }

      else if(name===""){
        alert("입력하세요2");
        return;
      }
      alert(name);
      I.innerHTML = name;

      
    };