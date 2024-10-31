import { Slot } from "expo-router";
import { Text, View } from "react-native";

function Header() {

  return(

    <View>
<Text>Header layout</Text>  
      </View>

  )
}


function Footer() {

  return(

    <View>
<Text>Footer layout</Text>  
      </View>

  )
}





export default function Home(){

  return(

    <View>
    <Header></Header>

    <Slot></Slot>

    <Footer></Footer>
    </View>

  )

}