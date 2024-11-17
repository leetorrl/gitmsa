// Code 6-2-3
import MyButton from './MyButton';

// 기본 정보 선언
export default {
  title: 'MyApp/MyButton',
  component: MyButton,
};

// Index, White 스토리 추가
export const Index = {
  render: () => <MyButton primary size="medium" label="버튼"
    onClick={() => console.log('Hello, Storybook!!')}/>
};

export const White = {
  render: () => <MyButton size="small" label="버튼"
    backgroundColor="#fff" />
};



// Code 6-2-4
// import MyButton from './MyButton';
// import { fn } from '@storybook/test';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   args: { onClick: fn() },
// };

// // Index, White 스토리 추가
// export const Index = {
//   render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };



// Code 6-2-5
// import MyButton from './MyButton';
// import { fn } from '@storybook/test';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   args: { onClick: fn() },
// };

// // Index, White 스토리 추가
// export const Index = {
//   render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-5
// import MyButton from './MyButton';
// import { fn } from '@storybook/test';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   args: {
//     onClick: fn(),
//     label: 'Push!!',
//   },
// };

// // Index, White 스토리 추가
// export const Index = {
//   render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-7
// import MyButton from './MyButton';
// import { fn } from '@storybook/test';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   args: { onClick: fn() },
//   argTypes: {
//     size: {
//       control: { type: 'select' },
//     },
//   },
// };

// // Index, White 스토리 추가
// export const Index = {
//   render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     onClick: {
//       type: 'function',
//       description: 'click handler',
//     }
//   },
// };

// // Index, White 스토리 추가
// export const Index = {
//   // render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Cod 6-2-12
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
// };

// // Index, White 스토리 추가
// export const Index = {
//   // render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-12
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   argTypes: {
//     size: {
//       control: { type: 'select' },
//     },
//     handleClick: { action: 'clicked' }
//   },
// };

// // Index, White 스토리 추가
// export const Index = {
//   render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     onClick: () => console.log('Hello, Storybook!!')
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff'
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-13
// import MyButton from './MyButton';
// import { action } from '@storybook/addon-actions';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,
//   argTypes: {
//     size: {
//       control: { type: 'select' },
//     },
//     handleClick: { action: 'clicked' }
//   },
// };

// // Index, White 스토리 추가
// export const Index = {
//   render: args => <MyButton {...args} />,
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     },
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-14
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(5);
//   },
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-15
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-16
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-17
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-19
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   },
//   decorators: [
//     Story => (
//       <div style={{
//         height: 150,
//         display: 'flex',
//         justifyContent: 'center',
//         alignItems: 'center',
//         backgroundColor: '#ccc',
//       }}>
//         <Story />
//       </div>
//     ),
//   ],
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-20
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   },
//   parameters: {
//     layout: 'centered',
//   },
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-21
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   },
//   parameters: {
//     layout: 'centered',
//   },
//   tags: ['autodocs'],
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };



// Code 6-2-22
// import { userEvent, within } from '@storybook/testing-library';
// import { expect } from '@storybook/jest';
// import { action } from '@storybook/addon-actions';
// import MyButton from './MyButton';

// // 기본 정보 선언
// export default {
//   title: 'MyApp/MyButton',
//   component: MyButton,

//   argTypes: {
//     primary: {
//       type: 'boolean',
//       description: 'Primary 색상 활성화 여부',
//     },
//     backgroundColor: {
//       type: 'string',
//       description: '배경색'
//     },
//     size: {
//       type: {
//         name: 'enum',
//         value: ['small', 'medium', 'large']
//       },
//       control: { type: 'select' },
//       description: '버튼 크기'
//     },
//     label: {
//       type: 'string',
//       description: '버튼 캡션'
//     },
//     handleClick: { action: 'clicked' }
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   },
//   parameters: {
//     layout: 'centered',
//   },
//   // tags: ['autodocs'],
// };

// // Index, White 스토리 추가
// // Index 스토리의 동작을 선언한다.
// export const Index = {
//   args: {
//     primary: true,
//     size: 'medium',
//     label: '버튼',
//     // 이벤트 핸들러는 비활성화
//     handleClick: e => {
//       action('clicked')(e, new Date());
//     }, 
//   },
//   play: async ({ args, canvasElement }) => {
//     const canvas = within(canvasElement);
//     const button = canvas.getByRole('button');
//     userEvent.click(button);
//     userEvent.click(button);
//     expect(args.onClick).toHaveBeenCalledTimes(2);
//   },
//   parameters: {
//     backgrounds: {
//       values: [
//         { name: 'ghostwhite', value: '#f8f8ff' },
//         { name: 'aquamarine', value: '#7fffd4' },
//         { name: 'coral', value: '#ff7f50' },
//       ],
//     },
//   }
// };

// export const White = {
//   args: {
//     size: 'small',
//     label: '버튼',
//     backgroundColor: '#fff',
//     handleClick: action('clicked'),
//   }
// };

// export const Yellow = {
//   args: {
//     ...White.args,
//     backgroundColor: 'lightyellow'
//   }
// };