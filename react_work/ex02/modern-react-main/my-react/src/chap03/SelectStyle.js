import './SelectStyle.css';
import cn from 'classnames';

export default function SelectStyle({ mode }) {
  return (
    // mode 속성에 따라 스타일 클래스 전환
    <div className={`box ${mode === 'light' ? 'light' : 'dark'}`}>
      Hello World!
    </div>

    // <div className={mode === 'light' ? 'light' : 'dark'}>
    //   Hello World!
    // </div>

    // <div className={(mode !== 'light') && 'dark'}>
    //   Hello World!
    // </div>

    // <div className={cn('box', mode === 'light' ? 'light' : 'dark')}>
    //   Hello World!
    // </div>

    // <div className={cn(
    //   'box',
    //   {
    //     light: mode === 'light',
    //     dark: mode === 'dark'
    //   }
    // )}>
    //   Hello World!
    // </div>

    // <div className={cn(
    //   'box',
    //   [
    //     'panel',
    //     {
    //       light: mode === 'light',
    //       dark: mode === 'dark'
    //     }
    //   ]
    // )}>
    //   Hello World!
    // </div>
  );
}