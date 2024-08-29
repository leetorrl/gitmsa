
const mybgclass = ['bg-orange-400','bg-green-400','bg-yellow-400']
const removeclass = ()=>{
  for(const element of mybgclass){
  document.querySelectorAll('#result').classList.remove(element);
}

}

document.querySelectorAll('#orange').onclick = ()=>{

console.log("확인");
removeclass();
  document.querySelectorAll('#result').classList.add('bg-orange-400');
}

document.querySelectorAll('#green').onclick = ()=>{
  
  console.log("확인");
  removeclass();
  document.querySelectorAll('#result').classList.add('bg-green-400');
  }

  document.querySelectorAll('#yellow').onclick = ()=>{
   
    console.log("확인");
    removeclass();
    document.querySelectorAll('#result').classList.add('bg-yellow-400');
  }