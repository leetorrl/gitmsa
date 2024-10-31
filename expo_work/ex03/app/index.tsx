import { Link } from "expo-router"
import { Text, View } from "react-native"



export default function Index(){

    return (
 
        <View style={{marginTop:50}}>

<Text style={{fontSize:50}}>Index</Text>

<Link href="/home" style={{fontSize:30}}>Home</Link>
       
<Link href="/home/aa" style={{fontSize:30}}>AA</Link>

<Link href="(tabs)" style={{fontSize:30}}>tabs</Link>
                </View>
                
    )
}