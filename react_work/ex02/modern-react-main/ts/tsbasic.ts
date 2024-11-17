// Code 10-1-1
// 변수
let age: number = 30;

// 상수
const DEBUG: boolean = true;

// 함수
function getTriangleArea(base: number, height: number) : number {
  return base * height / 2;
}

// 클래스
class Person {
  name: string = '';
  age: number = 0;
  toString(): string {
    return `Person: ${this.name}（${this.age}세）`;
  }
}

// age = '20세'

// console.log(age.trim());

// let age = 30;

// function getTriangleArea(base: number, height: number) { ... }