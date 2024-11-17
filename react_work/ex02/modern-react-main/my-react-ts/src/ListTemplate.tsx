// import React, { FC, ReactNode } from 'react';
// import type { Book } from './Book';

// // Props 타입 선언
// type ListTemplateProps = {
//   src: Array<Book>,
//   children: (b: Book) => ReactNode
// };

// export default function ListTemplate({ src, children }: ListTemplateProps) {
//   return (
//     <dl>
//       {
//         src.map((elem, index) => (
//           <React.Fragment key={elem.isbn}>
//             {children(elem)}
//           </React.Fragment>
//       ))
//       }
//     </dl>
//   );
// }



// Code 10-2-16
import React, { FC, ReactNode } from 'react';
import type { Book } from './Book';

type ListTemplateProps = {
  src: Array<Book>,
  children: (b: Book) => ReactNode
};

const ListTemplate: FC<ListTemplateProps> = ({ src, children }) => {
  return (
    <dl>
      {
        src.map((elem, index) => (
          <React.Fragment key={index}>
            {children(elem)}
          </React.Fragment>
      ))
      }
    </dl>
  );
};

export default ListTemplate;
