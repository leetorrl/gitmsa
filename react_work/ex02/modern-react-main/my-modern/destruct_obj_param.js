function greet({ name, age }) {
  console.log(`안녕하세요, 저는 ${name}, ${age}세 입니다.`);
}

const my = { name: '사토리오', sex: '여성', age: 18 }; 
greet(my);  // 결과: 안녕하세요, 저는 사토리오, 18세 입니다.

// function greet(obj) {
//   console.log(` 안녕하세요, 저는 ${obj.name}, ${obj.age}세 입니다. `);
// }
