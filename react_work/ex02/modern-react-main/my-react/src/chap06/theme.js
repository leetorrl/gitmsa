import { createTheme } from "@mui/material";
import { green, orange } from "@mui/material/colors";

const theme = createTheme({
  // 앱에서 사용하는 컬러링 설정
  palette: {
    primary: {
      main: orange[500],
    },
    secondary: {
      main: green[500],
    }
  },
  spacing: 10,
});

export default theme;



// import { createTheme } from "@mui/material";
// import { green, orange } from "@mui/material/colors";

// const theme = createTheme({
//   // 앱에서 사용하는 컬러링 설정
//   palette: {
//     primary: {
//       main: orange[500],
//     },
//     secondary: {
//       main: green[500],
//     }
//   },
//   spacing: 10,
//   components: {
//     MuiButton: {
//       defaultProps: {
//         variant: 'contained',
//       },
//     },
//   },
// });

// export default theme;