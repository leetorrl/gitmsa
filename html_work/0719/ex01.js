

  const aa = document.getElementById("btn-min");
  const bb = document.getElementById("btn-max");
  const printDiv = document.getElementById("print-div");

  const n1 = document.getElementById("num1");
  const n2 = document.getElementById("num2");
  const n3 = document.getElementById("num3");
  const n4 = document.getElementById("num4");
  const n5 = document.getElementById("num5");

  function min(){
    // console.log(n1.value);
    const arr = [n1.Value, n2.Value, n3.Value, n4.Value, n5.Value]
  let min = n1.value;  

  for(let index =0; index<arr.length; index++){
    const element = arr[index];
    if(Number(min) > Number(element))
      min = element;
  }
printDiv.textContent = "최솟값 = "+min;

  }
    
    function max(){
      const arr = [n1.Value, n2.Value, n3.Value, n4.Value, n5.Value]
      let max = n1.value;
      for(const key of arr){
        console.log(key);
        if(Number(max)<Number(key))
          max=key;
      }  

      printDiv.textContent="최댓값 = "+max;
    }

  aa.addEventListener('click',min);
  bb.addEventListener('click',max);

  const cc = 10;
  let dd = 10;

  dd= 30;

  // console.log(dd);


    // console.log(i)

  printDiv.textContent = "안녕하세요 내용을 넣는 거에요...";