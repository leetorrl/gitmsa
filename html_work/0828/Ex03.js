
const arr = [];
arr.push('test');
arr.push('test');
arr.push('test');
console.log(arr);

arr = "asdf";
console.log(arr);

const obj = {};

obj.a = 10;
obj.b = ()=> {
  console.log('obj.b');
}

console.log(obj);
console.log(obj.a);
console.log(obj.b);

obj.b();