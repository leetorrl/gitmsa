// 논리형
let flag: boolean = false;

// 수치형
let pi: number = 3.14159265359;

// 문자열형
let title: string = '모험의 서';

// 배열형
let languages: string[] = ['JavaScript', 'PHP', 'Python', 'Ruby'];

// 튜플형
let person: [string, number, boolean] = ['홍길동', 50, false];

// 연관 배열형
let addresses: {[index: string]: string;} = {
  '홍길동': '충남 태안군 원북면',
  '신사임당': '경기도 파주시 문발로',
  '이순신': '경기도 고양시 진밭로'
};

// 객체 유형
let member: {
  name: string, 
  age: number, 
  married?: boolean
} = {
  name: '홍길동',
  age: 50,
  married: false
};

