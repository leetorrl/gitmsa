const doA = (a, b =20,c=30 )=>{
  console.log(`a = ${a}`);
  console.log(`b = ${b}`);
  console.log(`c = ${c}`);
}
doA(10);

//doB 함수 선언
function doB(){}

//doC 함수 선언
const doC = function(){} //this onclisck -> button this 는 버튼캐그가 됩니다.

//doD 함수 선언
const doD = () => {} //여기서는 this -> window 객체가 this가 됩니다.