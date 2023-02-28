// @flow

import type { ViewProps } from 'react-native/Libraries/Components/View/ViewPropTypes';
import type { HostComponent } from 'react-native/Libraries/Renderer/shims/ReactNativeTypes';
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

export type Props = $ReadOnly<{|
  ...ViewProps,
  startPoint?: $ReadOnlyArray<Float>,
  endPoint?: $ReadOnlyArray<Float>,
  colors: $ReadOnlyArray<Float>,
  locations?: $ReadOnlyArray<Float>,
  useAngle?: boolean,
  angleCenter?: $ReadOnlyArray<Float>,
  angle?: Float,
  borderRadii?: $ReadOnlyArray<Float>,
|}>;

export default (codegenNativeComponent<Props>(
  'BVLinearGradient',
): HostComponent<Props>);