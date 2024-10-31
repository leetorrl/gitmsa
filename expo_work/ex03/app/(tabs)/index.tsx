import { Link, useRouter } from 'expo-router';
import {  StyleSheet, Text, View  } from 'react-native';



export default function HomeScreen() {

// const router = useRouter()
// router.push('/home')



  return (
   
        <View style={{marginTop:50}}>

<Text style={{fontSize:30}} >INDEX</Text>

<Link href="/(tabs)/lotto">
<Text style={{fontSize:30}}>-Lotto-</Text>
</Link>

        </View>

  );
}

const styles = StyleSheet.create({
  titleContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 8,
  },
  stepContainer: {
    gap: 8,
    marginBottom: 8,
  },
  reactLogo: {
    height: 178,
    width: 290,
    bottom: 0,
    left: 0,
    position: 'absolute',
  },
});
