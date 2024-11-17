import React from 'react';

export default function ListTemplate({ src, children }) {
  return (
    <dl>
      {src.map(elem => (
        <React.Fragment key={elem.isbn}>
          {/* {children} */}
          {children(elem)}
        </React.Fragment>
      ))}
    </dl>
  );
}



// 렌더 프롭(Render Props)
// export default function ListTemplate({ src, render }) {
//   return (
//     <dl>
//       {src.map(elem => (
//         <React.Fragment key={elem.isbn}>
//           {render(elem)}
//         </React.Fragment>
//       ))}
//     </dl>
//   );
// }