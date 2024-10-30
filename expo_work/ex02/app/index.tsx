// export default function Home(){

// }

// sfc 로 자동완성됨
import AA from "@/mcomponents/aa"
import { View, Text, TouchableOpacity, StyleSheet } from "react-native";
import { useRouter } from "expo-router";
import { useEffect, useState } from "react";



  const Index = () => {
    const router = useRouter();
   

    const onPress = () => {
        router.push("/(tabs)");
    }
    const onConsole = () => {
        console.log("this is console log.")
    }

    const onMyMain = () => {
        router.push("/mymain");
    }

//watch랑 같은거
    useEffect(()=>{
        console.log("Index component useEffect")
    },[])

    return (

            <View style = {styles.container }>
              <Text style = {styles.text }>Index</Text>
              <Text style = {styles.text }>RouterLink - router.push Link - router.push</Text>
              <TouchableOpacity onPress={onPress}>
                <Text style={styles.text}>이거 누르면 변경된다</Text>
              </TouchableOpacity>
        
              <TouchableOpacity onPress={onPress}>
                <Text style={styles.text}>이거 누르면 출력된다</Text>
              </TouchableOpacity>
              <TouchableOpacity onPress={onMyMain}>
                <Text style={styles.text}>이거 누르면 MyMain으로 간다</Text>
              </TouchableOpacity>
              <AA />
            </View>
          );
        };
export default Index;


export const styles = StyleSheet.create({
    container:{
        marginTop: 50,
        flex:1,
        justifyContent: 'center',
        alignItems:'center'
    },
    text:{
        fontFamily: "JUA",
        fontSize:20,
        // fontWeight:'bold' 볼드 삭제해야 배민 ttf 적용됨
    }
});


